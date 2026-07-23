import NavComp from "../components/common/NavComp"
import FooterComp from "../components/common/FooterComp"

import { useEffect, useState } from "react";
import { getProducts } from "../services/productService";
import type { Product } from "../types/Product"

export default function ProductPage() {
    const [products, setProducts] = useState<Product[]>([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        getProducts()
            .then((data) => setProducts(data))
            .catch((error) => {
                console.error(error);
                setError("Failed to load products");
            })
            .finally(() => setLoading(false))
    }, [])

    if (loading) {
        return <p>Loading...</p>
    }

    if (error) {
        return (
            <>
                <NavComp />
                <main className="pt-16 min-h-screen ">
                    <p>{error}</p>
                </main>
                <FooterComp />
            </>
        )
    }

    return (
        <>
            <NavComp />
            <main className="pt-16 min-h-screen ">
                <div className="relative overflow-x-auto bg-neutral-primary-soft shadow-xs rounded-base border border-default">
                    <table className="w-full text-sm text-left rtl:text-right text-body">
                        <thead className="text-sm text-body bg-neutral-secondary-soft border-b rounded-base border-default">
                            <tr>
                                <th scope="col" className="px-6 py-3 font-medium">
                                    Product name
                                </th>
                                <th scope="col" className="px-6 py-3 font-medium">
                                    Brand
                                </th>
                                <th scope="col" className="px-6 py-3 font-medium">
                                    Description
                                </th>
                                <th scope="col" className="px-6 py-3 font-medium">
                                    Price
                                </th>
                                <th scope="col" className="px-6 py-3 font-medium">
                                    Stock
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            {products.map((product) => (
                                <tr key={product.productId} className="bg-neutral-primary border-b border-default">
                                    <th scope="row" className="px-6 py-4 font-medium text-heading whitespace-nowrap">
                                        {product.name}
                                    </th>
                                    <td className="px-6 py-4">
                                        {product.brand}
                                    </td>
                                    <td className="px-6 py-4">
                                        {product.description}
                                    </td>
                                    <td className="px-6 py-4">
                                        ${product.price}
                                    </td>
                                    <td className="px-6 py-4">
                                        {product.stockQuantity}
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            </main>
            <FooterComp />
        </>
    )
}
